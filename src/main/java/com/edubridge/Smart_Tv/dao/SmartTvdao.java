package com.edubridge.Smart_Tv.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.edubridge.Smart_Tv.model.SmartTv;
import com.edubridge.Smart_Tv.utils.HibernateUtils;

public class SmartTvdao implements SmartTvDaoI {

	@Override
	public void addSmartTv(SmartTv smartTv) { 
		Transaction tx = null;

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.persist(smartTv);
			tx = session.beginTransaction();
			tx.commit();
			System.out.println("new smartTv addedd!");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public List< SmartTv> getAllSmartTv() {
		List< SmartTv> contacts = new ArrayList< SmartTv>();
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {

			String hql = "from  SmartTv";
			Query query = session.createQuery(hql,  SmartTv.class);
			contacts = query.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return contacts;
	}

	@Override
	public  SmartTv getSmartTvById(Integer id) {
		 SmartTv smartTv = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			smartTv = session.get( SmartTv.class, id);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return smartTv;
	}

	@Override
	public void updateSmartTv(SmartTv contact) {
		Transaction tx = null;

		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			session.merge(contact);
			tx = session.beginTransaction();
			tx.commit();
			System.out.println("smartTv is updated!");

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void deleteSmartTv(Integer id) {
		Transaction tx = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			tx = session.beginTransaction();

			SmartTv contact = session.get(SmartTv.class, id);

			if (contact != null) {
				session.remove(contact);
				tx.commit();
				System.out.println("SmartTv is deleted!");
			} else {
				System.out.println("no SmartTv found!");
			}
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAllSmartTvs() {
		Transaction tx = null;
		try (Session session = HibernateUtils.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			String hql = "delete from SmartTv";
			Query query = session.createQuery(hql);
			query.executeUpdate();
			System.out.println("All SmartTv are deleted");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}
}

package app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sr.unasat.hrm.entities.JobTitle;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        // Create EntityManagerFactory
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hrmPersistenceUnit");


        // Create EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Begin transaction
        entityManager.getTransaction().begin();

        // Perform database operations (if any)
        //perform an insert operation
        // Perform an insert operation
        JobTitle jobTitle = new JobTitle();
        //jobTitle.setId(2);
        jobTitle.setName("Delivery Manager");

        entityManager.persist(jobTitle);

        // Commit transaction
        entityManager.getTransaction().commit();

        // Retrieve all records from the job_title table
        List<JobTitle> jobTitles = entityManager.createQuery("SELECT j FROM JobTitle j", JobTitle.class).getResultList();
        for (JobTitle jt : jobTitles) {
            System.out.println(jt);
        }

        // Close EntityManager
        entityManager.close();


        // Close EntityManagerFactory
        entityManagerFactory.close();

        //System.out.println("Database created and dropped successfully!");
    }
}


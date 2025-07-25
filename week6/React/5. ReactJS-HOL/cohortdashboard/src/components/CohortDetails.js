import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = () => {
  const cohorts = [
    {
      name: 'REACTFSD2024 - React FSD',
      startedOn: '01-Jul-2024',
      status: 'Scheduled',
      coach: 'Tejasri',
      trainer: 'Ravi Kumar'
    },
    {
      name: 'DEVOPSADV01 - DevOps Advanced',
      startedOn: '15-Jun-2024',
      status: 'Ongoing',
      coach: 'Apoorv',
      trainer: 'Elisa Smith'
    },
    {
      name: 'PYDSF23 - Python Data Science FSD',
      startedOn: '10-May-2024',
      status: 'Ongoing',
      coach: 'Swetha',
      trainer: 'John Doe'
    },
    {
      name: 'JAVA24BATCH - Java Full Stack',
      startedOn: '05-Jul-2024',
      status: 'Ongoing',
      coach: 'Anusha',
      trainer: 'Vinay'
    }
  ];

  return (
    <div className={styles.wrapper}>
      <h2 className={styles.heading}>Cohorts Details</h2>
      <div className={styles.container}>
        {cohorts.map((cohort, index) => (
          <div className={styles.box} key={index}>
            <h3
              style={{
                color: cohort.status.toLowerCase() === 'ongoing' ? 'green' : 'blue'
              }}
            >
              {cohort.name}
            </h3>
            <p><strong>Started On</strong><br />{cohort.startedOn}</p>
            <p><strong>Current Status</strong><br />{cohort.status}</p>
            <p><strong>Coach</strong><br />{cohort.coach}</p>
            <p><strong>Trainer</strong><br />{cohort.trainer}</p>
          </div>
        ))}
      </div>
    </div>
  );
};

export default CohortDetails;

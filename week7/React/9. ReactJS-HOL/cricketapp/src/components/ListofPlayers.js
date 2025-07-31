import React from 'react';
import './ListofPlayers.css';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 88 },
    { name: 'Rohit Sharma', score: 95 },
    { name: 'KL Rahul', score: 45 },
    { name: 'Shubman Gill', score: 72 },
    { name: 'Ravindra Jadeja', score: 68 },
    { name: 'Rishabh Pant', score: 90 },
    { name: 'Hardik Pandya', score: 34 },
    { name: 'Suryakumar Yadav', score: 79 },
    { name: 'Jasprit Bumrah', score: 28 },
    { name: 'Mohammed Shami', score: 40 },
    { name: 'Yuzvendra Chahal', score: 55 }
  ];

  const below70 = players.filter(player => player.score < 70);

  return (
    <div className="players-container">
      <h2 className="players-title">🏏 List of Players</h2>

      <h3 className="sub-title">All Players:</h3>
      <div className="players-grid">
        {players.map((player, index) => (
          <div
            key={index}
            className={`player-card ${player.score < 70 ? 'low-score-card' : ''}`}
          >
            <strong>{player.name}</strong>
            <br />
            Score: {player.score}
          </div>
        ))}
      </div>

      <h3 className="sub-title red">Players with Scores Below 70:</h3>
      <div className="players-grid">
        {below70.map((player, index) => (
          <div key={index} className="player-card low-score-card">
            <strong>{player.name}</strong>
            <br />
            Score: {player.score}
          </div>
        ))}
      </div>
    </div>
  );
};

export default ListofPlayers;

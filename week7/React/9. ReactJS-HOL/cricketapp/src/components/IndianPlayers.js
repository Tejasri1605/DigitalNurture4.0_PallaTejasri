import React from 'react';
import './IndianPlayers.css';

const IndianPlayers = () => {
  const team = ['Virat', 'Rohit', 'KL Rahul', 'Pant', 'Hardik', 'Shami', 'Jadeja'];

  const oddPlayers = team.filter((_, index) => index % 2 !== 0);
  const evenPlayers = team.filter((_, index) => index % 2 === 0);

  const T20 = ['SKY', 'Gill', 'Bumrah'];
  const Ranji = ['Pujara', 'Rahane', 'Ashwin'];
  const mergedPlayers = [...T20, ...Ranji];

  return (
    <div className="players-container">
      <h2 className="players-title">🟦 Odd Team Players</h2>
      <div className="players-grid blue">
        {oddPlayers.map((player, idx) => (
          <div className="player-card" key={idx}>
            {player}
          </div>
        ))}
      </div>

      <h2 className="players-title">🟩 Even Team Players</h2>
      <div className="players-grid green">
        {evenPlayers.map((player, idx) => (
          <div className="player-card" key={idx}>
            {player}
          </div>
        ))}
      </div>

      <h2 className="players-title">🔁 Merged T20 + Ranji Players</h2>
      <div className="players-grid merged">
        {mergedPlayers.map((player, idx) => (
          <div className="player-card" key={idx}>
            {player}
          </div>
        ))}
      </div>
    </div>
  );
};

export default IndianPlayers;

import React from 'react';
import './App.css';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  return (
    <div className="App">
      <h1 style={{ marginTop: '20px' }}>🏏 Cricket App</h1>
      <ListofPlayers />
      <IndianPlayers />
    </div>
  );
}

export default App;

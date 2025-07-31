import React, { useState } from 'react';
import './App.css';

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');
  const [euros, setEuros] = useState('');

  // Counter Handlers
  const handleIncrement = () => {
    setCount(count + 1);
    sayHello();
  };

  const handleDecrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    console.log("Hello! Count incremented.");
  };

  // Welcome
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // Synthetic event
  const handleSyntheticEvent = (e) => {
    alert("I was clicked");
  };

  // Currency Conversion Logic
  const handleConversion = (e) => {
    e.preventDefault();
    if (!amount || isNaN(amount)) {
      alert("Please enter a valid amount.");
      return;
    }
    if (currency.toLowerCase() !== "inr") {
      alert("Currently only INR to Euro conversion is supported.");
      return;
    }
    const euro = parseFloat(amount) * 0.011;
    setEuros(euro.toFixed(2));
  };

  return (
    <div className="App">
      <h1>React Event Examples</h1>

      {/* Counter Section */}
      <div>
        <h2>Counter: {count}</h2>
        <button onClick={handleIncrement}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
      </div>

      {/* Say Welcome */}
      <div style={{ marginTop: '20px' }}>
        <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
      </div>

      {/* Synthetic Event */}
      <div style={{ marginTop: '20px' }}>
        <button onClick={handleSyntheticEvent}>Click me (Synthetic Event)</button>
      </div>

      {/* Currency Converter */}
      <div style={{ marginTop: '30px', textAlign: 'center' }}>
  <h2 style={{ color: 'green', fontWeight: 'bold', fontSize: '28px' }}>Currency Convertor!!!</h2>

  <form onSubmit={(e) => {
    e.preventDefault();
    if (!amount || isNaN(amount)) {
      alert("Please enter a valid amount.");
      return;
    }

    if (currency.toLowerCase() === 'euro') {
      const converted = parseFloat(amount) * 80;
      alert(`Converting to  Euro Amount is ${converted}`);
    } else {
      alert("Conversion for the entered currency is not supported.");
    }
  }} 
  style={{ display: 'inline-block', marginTop: '15px', textAlign: 'left' }}>
    
    <div style={{ marginBottom: '10px' }}>
      <label>
        Amount:
        <input
          type="text"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
          style={{ marginLeft: '10px', padding: '6px', width: '200px' }}
        />
      </label>
    </div>

    <div style={{ marginBottom: '10px' }}>
      <label>
        Currency:
        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
          style={{ marginLeft: '10px', padding: '6px', width: '200px' }}
        />
      </label>
    </div>

    <div style={{ textAlign: 'center' }}>
      <button type="submit">Submit</button>
    </div>
  </form>
</div>

    </div>
  );
}

export default App;

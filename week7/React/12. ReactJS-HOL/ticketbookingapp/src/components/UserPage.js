import React from 'react';

function UserPage() {
  return (
    <div>
      <h2>Welcome, User!</h2>
      <p>You can now book your flight tickets below.</p>
      <h3>Book Your Flight:</h3>
      <ul>
        <li>Flight A <button>Book Now</button></li>
        <li>Flight B <button>Book Now</button></li>
        <li>Flight C <button>Book Now</button></li>
      </ul>
    </div>
  );
}

export default UserPage;

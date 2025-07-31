import React, { useState } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

function LoginControl() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  let button;
  let page;

  if (isLoggedIn) {
    button = <button onClick={handleLogoutClick}>Logout</button>;
    page = <UserPage />;
  } else {
    button = <button onClick={handleLoginClick}>Login</button>;
    page = <GuestPage />;
  }

  return (
    <div>
      {button}
      {page}
    </div>
  );
}

export default LoginControl;

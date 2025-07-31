import React from 'react';

function App() {
  const heading = <h1 style={{ textAlign: 'center', color: '#2c3e50' }}>🏢 Office Space Rental Listings</h1>;

  const officeImage = "https://images.unsplash.com/photo-1573164713988-8665fc963095"; // Any valid office image

  const officeList = [
    { id: 1, name: "Cyber Towers", rent: 45000, address: "HITEC City, Hyderabad" },
    { id: 2, name: "WeWork BKC", rent: 75000, address: "Bandra Kurla Complex, Mumbai" },
    { id: 3, name: "Regus Residency Road", rent: 60000, address: "Residency Road, Bengaluru" },
    { id: 4, name: "Cowrks RMZ", rent: 82000, address: "RMZ Infinity, Bengaluru" }
  ];

  return (
    <div style={{ padding: "40px", fontFamily: "Segoe UI, sans-serif", background: "#f4f6f8" }}>
      {heading}

      <img
        src={officeImage}
        alt="Office Space"
        style={{
          display: 'block',
          margin: '20px auto',
          width: '80%',
          maxWidth: '600px',
          borderRadius: '10px',
          boxShadow: '0 4px 10px rgba(0,0,0,0.2)'
        }}
      />

      <div style={{ maxWidth: '800px', margin: '30px auto' }}>
        {officeList.map((office) => (
          <div
            key={office.id}
            style={{
              background: "#fff",
              padding: "20px",
              borderRadius: "10px",
              marginBottom: "20px",
              boxShadow: "0 2px 8px rgba(0, 0, 0, 0.1)"
            }}
          >
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong>{" "}
              <span style={{ color: office.rent < 60000 ? "red" : "green", fontWeight: "bold" }}>
                ₹{office.rent}
              </span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;

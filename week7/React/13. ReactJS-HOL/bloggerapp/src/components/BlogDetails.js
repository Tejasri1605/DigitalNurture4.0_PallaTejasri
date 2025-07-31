import React from 'react';

function BlogDetails() {
  const blogs = [
    {
      title: 'React Learning',
      author: 'Stephen Biz',
      description: 'Welcome to learning React!',
    },
    {
      title: 'Installation',
      author: 'Schewzdenier',
      description: 'You can install React from npm.',
    },
  ];

  return (
    <div className="component-box">
      <h2>Blog Details</h2>
      {blogs.map((blog, idx) => (
        <div key={idx} className="detail-item">
          <h3>{blog.title}</h3>
          <p><strong>{blog.author}</strong></p>
          <p>{blog.description}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;

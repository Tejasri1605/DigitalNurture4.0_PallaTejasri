import React, { useState } from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [selected, setSelected] = useState('book');
  const [showComponent, setShowComponent] = useState(true);

  const renderComponent = () => {
    switch (selected) {
      case 'book':
        return <BookDetails />;
      case 'blog':
        return <BlogDetails />;
      case 'course':
        return <CourseDetails />;
      default:
        return <BookDetails />;
    }
  };

  return (
    <div className="App">
      <h1>📚 BloggerApp - Conditional Rendering Demo</h1>
      
      <div className="button-group">
        <button onClick={() => setSelected('book')}>Book</button>
        <button onClick={() => setSelected('blog')}>Blog</button>
        <button onClick={() => setSelected('course')}>Course</button>
        <button onClick={() => setShowComponent(!showComponent)}>
          {showComponent ? 'Hide' : 'Show'} Component
        </button>
      </div>

      {showComponent ? renderComponent() : <p className="info">Component is hidden</p>}
    </div>
  );
}

export default App;

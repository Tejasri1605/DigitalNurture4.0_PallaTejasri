import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
      errorMessage: ''
    };
  }

  componentDidMount() {
    this.loadPosts();
  }

  loadPosts() {
  const data = [
    { id: 1, title: "React Lifecycle Explained", body: "Learn how React's componentDidMount and componentDidCatch work in real projects." },
    { id: 2, title: "Building Blog with React", body: "This is a simple blog app that fetches posts and displays them using class components." },
    { id: 3, title: "Error Boundaries in React", body: "componentDidCatch is used to handle errors and show fallback UI gracefully." }
  ];
  this.setState({ posts: data });
}


  componentDidCatch(error, info) {
    alert(`An error occurred: ${error.toString()}`);
  }

  render() {
    if (this.state.hasError) {
      return <h2 style={{ color: 'red' }}>Error: {this.state.errorMessage}</h2>;
    }

    return (
      <div style={{ padding: '20px' }}>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ marginBottom: '20px', borderBottom: '1px solid #ccc' }}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;

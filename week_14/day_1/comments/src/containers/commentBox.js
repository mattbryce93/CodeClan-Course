import React, { Component } from 'react';
import CommentList from '../components/commentList';

class CommentBox extends Component{
  constructor(props){
    super(props);
    this.state = {
      data: [{
        id: 1,
        author: "Robocop",
        text: "Your move creep"
      },
      {
      id: 2,
      author: "Archer",
      text: "Are we not doing phrasing?"
    }]
    }
  }

  render(){
    return <div className="comment-box">
      <h2>Comment List</h2>
      <CommentList data={this.state.data} />
    </div>
  }
}

export default CommentBox;

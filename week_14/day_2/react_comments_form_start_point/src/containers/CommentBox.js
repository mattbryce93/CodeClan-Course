import React from 'react'
import CommentList from '../components/CommentList'
import CommentForm from '../components/CommentForm'

class CommentBox extends React.Component {

  constructor(props) {
    super(props)
    this.state = {
      data: [{ id:1, author:'Beth', text:'I love cats!' }]
    }
    this.handleCommentSubmit = this.handleCommentSubmit.bind(this);
  }

  handleCommentSubmit(comment){
    comment.id = Date.now();
    const newComments = this.state.data.concat([comment]);
    this.setState({data: newComments});
  }

  render() {
     return (
      <div className="comment-box">
        <CommentForm onCommentSubmit={this.handleCommentSubmit}/>
        <h2>Add a Comment</h2>
        <CommentList data={this.state.data} />
      </div>
    )
  }

}

export default CommentBox;

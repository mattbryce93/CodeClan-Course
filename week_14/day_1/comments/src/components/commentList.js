import React, { Component } from "react";
import Comment from "./comment";

const CommentList = (props) => {
  const commentNodes = props.data.map(comment => {
    return(
      <Comment author={comment.author} key={comment.id}>
        {comment.text}
      </Comment>
    )
  })
  return(
    <div className="comment-list">
      {commentNodes}
    </div>
  )
}

// class CommentList extends Component{
//
//   render(){
//     const commentNodes = this.props.data.map(comment => {
//       return(
//         <Comment author={comment.author} key={comment.id}>
//           {comment.text}
//         </Comment>
//       )
//     })
//     return(
//       <div className="comment-list">
//         {commentNodes}
//       </div>
//     )
//   }
// }

export default CommentList;

import React, { Component } from "react";

const Comment = (props) => {
  return(
    <div className="comment">
    <h4 className="comment-author">{props.author}</h4>
    {props.children}
    </div>
  );
}

// class Comment extends Component{
//   render(){
//     return(
//       <div className="comment">
//         <h4 className="comment-author">{this.props.author}</h4>
//         {this.props.children}
//       </div>
//     )
//   }
// }

export default Comment;

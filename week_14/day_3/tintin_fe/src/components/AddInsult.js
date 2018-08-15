import React from 'react';
import "./AddInsult.css";

class AddInsult extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            insult: ""
        };

        this.handleChange = this.handleChange.bind(this);
        this.submitQuote = this.submitQuote.bind(this);
    }

    handleChange(event){
        event.preventDefault();
        this.setState({insult: event.target.value});
    }

    submitQuote(event){
        event.preventDefault();
        if(this.state.insult){
          fetch("http://localhost:3001/insults", {
            method: "POST",
            headers: {
              "Content-Type": "application/json"
            },
            body: JSON.stringify(this.state)
          })
          .then(response => this.setState({insult: ''}))
          .catch(error => console.log(error));
        }
    }

    render(){
        return(
            <div id="wrap">
                <h1>Add An Insult</h1>
                <form>
                    <input onChange={this.handleChange} type="text" name="insult" value={this.state.insult} />
                    <input onClick={this.submitQuote} type="submit" value="submit" />
                </form>
            </div>
        );
    }
}

export default AddInsult;

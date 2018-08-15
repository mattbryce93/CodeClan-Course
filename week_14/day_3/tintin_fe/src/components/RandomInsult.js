import React from 'react';
import "./RandomInsult.css";

class RandomInsult extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            insult: null
        };

        this.fetchInsult = this.fetchInsult.bind(this);
    }

    componentDidMount(){
        this.fetchInsult();
    }

    fetchInsult(event){
        if(event){
            event.preventDefault();
        }
        fetch("http://localhost:3001/insults/random")
            .then(response => response.json())
            .then(insult => this.setState({insult: insult}));
    }

    render(){
        if(!this.state.insult){
            return null;
        }

        return (
            <div id="wrap">
                <button id="randomHaddock" onClick={this.fetchInsult}>Fetch an insult!</button>
                <div id="haddockWrap">
                    <img src="/images/haddock.jpg" alt="Haddock"/>
                    <p id="insult">{this.state.insult.insult}</p>                
                </div>
            </div>
        );
    }
}

export default RandomInsult;
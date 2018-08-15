import React from 'react';
import TagCloud from 'react-tag-cloud';
import randomColor from 'randomcolor';

class Insults extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            insults: []
        };
    }

    componentDidMount(){
        fetch("http://localhost:3001/insults")
            .then(response => response.json())
            .then(insults => this.setState({insults: insults}))
            .catch(err => console.log(err));
    }

    render(){
        const insultDivs = this.state.insults.map(insult => <div key={insult._id}>{insult.insult}</div>);
        return (
            <TagCloud style={{
                fontFamily: 'Coming Soon, cursive',
                fontSize: 30,
                fontWeight: 'bold',
                fontStyle: 'italic',
                padding: 5,
                color: () => randomColor({"hue": "blue"}),
                width: '100%',
                height: '400px',
                flex: 1
            }}>
                {insultDivs}
            </TagCloud>
        );
    }
}

export default Insults;

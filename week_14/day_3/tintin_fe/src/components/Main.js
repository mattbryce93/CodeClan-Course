import React, {Component} from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import Navbar from './Navbar';
import Books from './Books';
import Insults from './Insults';
import RandomInsult from './RandomInsult';
import AddInsult from './AddInsult';

class Main extends Component {
    render(){
        return (
            <Router>
                <React.Fragment>
                    <Navbar />
                    <Route exact path="/" component={Books} />
                    <Route path="/insults" component={Insults} />
                    <Route path="/random-insult" component={RandomInsult} />
                    <Route path="/add-insult" component={AddInsult} />
                </React.Fragment>
            </Router>
        );
    }
}

export default Main;
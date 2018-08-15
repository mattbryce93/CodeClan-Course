import React from 'react';
import {Link} from 'react-router-dom';
import "./Navbar.css";

const Navbar = (props) => {
    return (
        <nav>
            <ul>
                <li><Link to="/">Books</Link></li>
                <li><Link to="/insults">Insults</Link></li>
                <li><Link to="/random-insult">Random Insult</Link></li>
                <li><Link to="/add-insult">Add an insult</Link></li>
            </ul>
        </nav>
    );
};

export default Navbar;
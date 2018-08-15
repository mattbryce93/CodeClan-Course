import React from 'react';
import "./Books.css";

class Books extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            books: []
        };
    }

    componentDidMount(){
        fetch("http://localhost:3001/books")
            .then(response => response.json())
            .then(books => this.setState({books: books.reverse()}))
            .catch(err => console.log(err));
    }

    render(){
        const books = this.state.books.map(book => {
            return (
                <div className="book" key={book._id}>
                    <div className="left">
                        <h4>{book.title}</h4>
                        <h5>{book.title_fr} - {book.released}</h5>
                        <p>{book.description}</p>
                    </div>

                    <img src={book.image} alt={book.title} />

                </div>
            );
        });
        return (
            <div id="wrap">
                {books}
            </div>
        )
    }
}

export default Books;

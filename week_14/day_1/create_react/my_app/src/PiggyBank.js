import React from 'react';

class PiggyBank extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      total: 0
    }
    this.deposit = this.deposit.bind(this)
    this.withdraw = this.withdraw.bind(this)
  }

  // componentWillMount(){
  //   console.log("the component will mount!");
  //   const button = document.querySelector('button');
  //   console.log("Button:", button);
  // }
  //
  // componentDidMount(){
  //   console.log("the component did mount!");
  //   const button = document.querySelector('button');
  //   console.log("Button:", button);
  // }

  // componentDidUpdate(prevProps, prevState){
  //   console.log("Component DID UPDATE!");
  //   console.log({prevProps});
  //   console.log({prevState});
  // }

  componentDidMount(){
    // const request = new XMLHttpRequest();
    // request.open("GET", "https://restcountries.eu/rest/v2/all");
    // request.addEventListener('load', function(){
    //   console.log(this.responseText);
    // });
    // request.send();

    fetch("https://restcountries.eu/rest/v2/all")
    .then(responseText => responseText.json())
    .then(countriesData => console.log(countriesData));
  }


  deposit() {
    this.setState(prevState => {
      return {total: prevState.total + this.props.depositAmount}
    })
  }

  withdraw() {
    this.setState(prevState => {
      return {total: prevState.total - this.props.depositAmount}
    })
  }

  render() {
    return (
      <div className="bank-box">
        <h1>{this.props.owner}'s {this.props.title}</h1>
        <p>I contain £{this.state.total}</p>
        <button onClick={this.deposit}>Add</button>
        <button onClick={this.withdraw}>Withdraw</button>
      </div>
    );
  }
}

export default PiggyBank;


// Add an owner property to the piggy bank.
// Add a 'withdraw' button which decreases the total.
// Add a depositAmount property - pass in a value which depositing or withdrawing will change the total by.

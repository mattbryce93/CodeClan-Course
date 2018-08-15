import React from 'react';
import CountrySelector from '../components/CountrySelector';
import CountryDetail from '../components/CountryDetail';

class CountryContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      countries: [],
      currentCountry: null
    };
    this.handleCountrySelected = this.handleCountrySelected.bind(this);
  }

  componentDidMount(){
    fetch("https://restcountries.eu/rest/v2/all")
    .then(response => response.json())
    .then(countries => this.setState({countries}));
  }

  handleCountrySelected(index){
    const selectedCountry = this.state.countries[index];
    this.setState({currentCountry: selectedCountry});
  }

  render(){
    return(
      <React.Fragment>
        <h1>Country Container</h1>
        <CountrySelector countries={this.state.countries} onCountrySelected={this.handleCountrySelected}/>
        <CountryDetail country={this.state.currentCountry}/>
      </React.Fragment>
    )
  }
}

export default CountryContainer;

import React, { Component } from 'react';
import PokemonDropdown from '../components/PokemonDropdown';
import PokemonDetail from '../components/PokemonDetail';

class PokemonBox extends Component{
  constructor(props){
    super(props);
    this.state = {
      pokemons: [],
      selectedPokemon: null
    }
    this.handlePokemonSelected = this.handlePokemonSelected.bind(this);
  }

  componentDidMount(){
    fetch("https://pokeapi.co/api/v2/pokemon/?limit=151")
    .then(response => response.json())
    .then(pokemons => this.setState({pokemons}));
  }

  handlePokemonSelected(url){
    fetch(url)
    .then(response => response.json())
    .then(selectedPokemon => this.setState({selectedPokemon}));
    console.log(this.state.selectedPokemon);
  }

  render(){
    return(
      <React.Fragment>
        <PokemonDropdown pokemons={this.state.pokemons} onPokemonSelect={this.handlePokemonSelected}/>
        <PokemonDetail selectedPokemon={this.state.selectedPokemon}/>
      </React.Fragment>
    )
  }
}

export default PokemonBox;

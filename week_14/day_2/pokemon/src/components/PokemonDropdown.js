import React from 'react';
import { capitalize } from 'lodash';

const PokemonDropdown = (props) => {
  if(!props.pokemons.results){
    return null;
  }

  const options = props.pokemons.results.map((pokemon, index) => {
    return <option value={pokemon.url} key={index}>{capitalize(pokemon.name)}</option>
  });

  function handleChange(event){
    props.onPokemonSelect(event.target.value);
  }

  return(
    <React.Fragment>
      <select name="pokemon-select" id="pokemon-select" onChange={handleChange}>
        <option selected disabled>Select a Pokemon...</option>
        {options}
      </select>
    </React.Fragment>
  )
}

export default PokemonDropdown;

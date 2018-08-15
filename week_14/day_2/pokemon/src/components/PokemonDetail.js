import React from 'react';
import { capitalize } from 'lodash';

const PokemonDetail = (props) => {
  if(!props.selectedPokemon){
    return null;
  }

  console.log(props.selectedPokemon);

  const prettyName = capitalize(props.selectedPokemon.name)

  const types = props.selectedPokemon.types.map(type => {
    return <li>{type.type.name}</li>
  })

  const abilities = props.selectedPokemon.abilities.map(ability => {
    return <li>{ability.ability.name}</li>
  })

  const height = props.selectedPokemon.height/10

  const moves = props.selectedPokemon.moves.map(move => {
    return <li>{move.move.name}</li>
  })

  return(
    <React.Fragment>
      <p>{prettyName}</p>
      <img src={props.selectedPokemon.sprites.front_default}></img>
      <div className="types">
        <p>Types</p>
        {types}
      </div>
      <div className="abilities">
        <p>Abilities</p>
        {abilities}
      </div>
      <div className="height">
        <p>Height: {height}m</p>
      </div>
      <div className="moves">
        <p>Learnable Moves</p>
        {moves}
      </div>
    </React.Fragment>
  )
}

export default PokemonDetail;

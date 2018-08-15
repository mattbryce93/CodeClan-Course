import React from 'react';

const CountryDetail = (props) => {
  if(!props.country){
    return null;
  }
  console.log(props.country);
  return  <p>{props.country.name}</p>;
};

export default CountryDetail;

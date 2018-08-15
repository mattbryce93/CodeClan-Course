import React from 'react';

const CountrySelector = (props) => {
  const options = props.countries.map((country, index) => {
    return <option value={index} key={index}>{country.name}</option>
  });

  function handleChange(event){
    props.onCountrySelected(event.target.value);
  }

  return(
    <select name="country-selector" id="country-selector" onChange={handleChange}>
      <option disabled selected>Select a Country</option>
      {options}
    </select>
  );
}

export default CountrySelector;

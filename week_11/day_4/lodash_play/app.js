const _ = require("lodash");

let films = [
    {title: "K-Pax", year: 2001, rating: 7.5, genre: "sci-fi"},
    {title: "Bill & Ted", year: 1989, rating: 9.5, genre: "sci-fi"},
    {title: "Robocop", year: 1987, rating: 10.5, genre: "sci-fi"},
    {title: "Pulp Fiction", year: 1994, rating: 10, genre: "drama"},
    {title: "The Wicker Man", year: 1973, rating: 15, genre: "horror"}
];

let scifi = _.filter(films, {"genre": "sci-fi"});
console.log(scifi);

// let average = _.meanBy(films, "rating");
// console.log(average);
//
// let goodFilms = _.filter(films, film => film.rating >= 10);
// console.log(goodFilms);
//
// let bestFilm = _.maxBy(films, "rating");
// console.log(bestFilm);

// let grouped = _.groupBy(films, "genre");
// console.log(grouped);

// let eightiesAverage = _.chain(films)
//                         .filter(film => film.year >= 1980 && film.year <= 1989)
//                         .meanBy("rating")
//                         .value();
//
// console.log(eightiesAverage);

import './App.css';
import React, {Component} from "react";
import {BrowserRouter as Router, Navigate ,Route, Routes} from 'react-router-dom'
import Authors from "../Authors/authors"
import Books from "../Books/BooksList/books"
import Countries from "../Countries/countries"
import Header from "../Header/header"
import BookAdd from "../Books/BookAdd/bookAdd";
import BookEdit from "../Books/BookEdit/bookEdit";

import BookShopService from "../../repository/bookShopRepository";

class App extends Component{

    constructor(props) {
        super(props);
        this.state = {
            authors:[],
            books:[],
            categories:{},
            countries:[],
            selectedBook: {}
        }
    }

    render() {
        return(
            <Router>
                <Header/>
                <main>
                    <div className="container">
                        <Routes>
                            <Route path={"/authors"} element={<Authors authors={this.state.authors}/>}/>

                            <Route path={"/books/add"} element={
                                <BookAdd  books={this.state.books}
                                          authors={this.state.authors}
                                          onAddBook={this.addBook}/>
                            }/>
                            <Route path={"/books/edit/:id"} element={
                                <BookEdit books={this.state.books}
                                          authors={this.state.authors}
                                          onEditBook={this.editBook}
                                          book={this.state.selectedBook}/>
                            }/>
                            <Route path={"/books"} element={
                                <Books books={this.state.books}
                                       onDelete={this.deleteBook}
                                       onEdit={this.getBook}
                                       onMarkBookAsTaken={this.markBookAsTaken}
                                />
                            }/>

                            <Route path={"/countries"} element={<Countries countries={this.state.countries}/>}/>
                            <Route path={"/*"} element={<Navigate to={"/books"}/>} />
                        </Routes>
                    </div>
                </main>
            </Router>
        );
    }

    componentDidMount() {
        this.fetchData()
    }
    fetchData = () => {
        this.loadBooks();
        this.loadAuthors();
        this.loadCountries();
    }


    loadAuthors = () => {
        BookShopService.fetchAuthors()
            .then((data) => {
                this.setState({
                    authors: data.data
                })
            });
    }

    loadBooks = () => {
        BookShopService.fetchBooks()
            .then((data) => {
                this.setState({
                    books: data.data,
                })
            });
        }

    loadCountries = () => {
        BookShopService.fetchCountries()
            .then((data) => {
                this.setState({
                    countries: data.data
                })
            });
    }

    deleteBook = (id) => {
        BookShopService.deleteBook(id)
            .then(() => {
                this.loadBooks();
            });
    }

    addBook = (name, category, author,availableCopies) => {
        BookShopService.addBook(name, category, author,availableCopies)
            .then(() => {
                this.loadBooks();
            });
    }

    getBook = (id) => {
        BookShopService.getBook(id)
            .then((data) => {
                this.setState({
                    selectedBook: data.data
                })
            })
    }

    editBook = (id, name, category, author,availableCopies) => {
        BookShopService.editBook(id, name, category, author,availableCopies)
            .then(() => {
                this.loadBooks();
            });
    }
    markBookAsTaken = (id) => {
        BookShopService.markBookAsTaken(id)
            .then(() => {
                this.loadBooks();
        });
    }

}


export default App;

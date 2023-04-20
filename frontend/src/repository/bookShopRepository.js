import axios from "../custom-axios/axios" ;

const BookShopService = {
    fetchAuthors:() =>{
        return axios.get("/authors");
    },
    fetchBooks:() =>{
        return axios.get("/books");
    },
    fetchCountries:() =>{
        return axios.get("/countries");
    },
    deleteBook: (id) => {
        return axios.delete(`/books/delete/${id}`);
    },
    addBook: (name, category, author,availableCopies) => {
        return axios.post("/books/add", {
            "name": name,
            "category": category,
            "author": author,
            "availableCopies":availableCopies
        });
    },
    editBook: (id, name, category, author,availableCopies) => {
        return axios.put(`/books/edit/${id}`, {
            "name": name,
            "category": category,
            "author": author,
            "availableCopies":availableCopies
        });
    },
    getBook: (id) => {
        return axios.get(`/books/${id}`);
    },

    markBookAsTaken:(id)=>{
        return axios.put(`/books/mark/${id}`);
    }
}
export default BookShopService;
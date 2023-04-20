import React from 'react';
import {useNavigate} from 'react-router-dom';

const BookEdit = (props) => {
    const navigate = useNavigate();

    //const history = useNavigate ();
    const [formData, updateFormData] = React.useState({
        name: "",
        category: "",
        author: 0,
        availableCopies: 0
    })

    const handleChange = (e) => {
        updateFormData({
           ...formData,
            //[e.target.name]: e.target.value.trim()
            [e.target.name]: e.target.value,
        })
    }

    const onFormSubmit = (e) => {
        e.preventDefault();
        const name = formData.name !== "" ? formData.name : props.book.name;
        const availableCopies = formData.availableCopies !== 0 ? formData.availableCopies : props.book.availableCopies;
        const category = formData.category !== "" ? formData.category : props.book.category;
        const author = formData.author !== 0 ? formData.author : props.book.author.id;

        props.onEditBook(props.book.id, name, availableCopies, category, author);
        //history.push("/books");
        navigate('/books');

    }

    return(
        <div className="row mt-5">
            <div className="col-md-5">
                <form onSubmit={onFormSubmit}>
                    <div className="form-group">
                        <label htmlFor="name">Book name</label>
                        <input type="text"
                               className="form-control"
                               id="name"
                               name="name"
                               placeholder={props.book.name}
                               onChange={handleChange}
                        />
                    </div>
                    <div className="form-group">
                        <label>Category</label>
                        <select name="category" className="form-control" onChange={handleChange}>
                            {props.books.map((term) =>
                                //ifelse
                                <option value={term.category}>{term.category}</option>
                            )}
                        </select>
                    </div>
                    <div className="form-group">
                        <label>Author</label>
                        <select name="authors" className="form-control" onChange={handleChange}>
                            {props.authors.map((term) =>
                                //ifelsse
                                <option value={term.id}>{term.name}</option>
                            )}
                        </select>
                    </div>
                    <div className="form-group">
                        <label htmlFor="availableCopies">available Copies</label>
                        <input type="text"
                               className="form-control"
                               id="availableCopies"
                               name="availableCopies"
                               placeholder={props.book.availableCopies}
                               onChange={handleChange}
                        />
                    </div>
                    <button id="submit" type="submit" className="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    )
}

export default BookEdit;








function create_table(table) {
    for (let i = 0; i < table.length; i++) {
        document.getElementById("my_books").innerHTML += `<tr>
        <td>${table[i].id}</td>
        <td>${table[i].title}</td>
        <td>${table[i].publish_year}</td>
        <td>${table[i].price}</td>
        <td>${table[i].left_in_stock}</td>
        <td>${table[i].book_image_src}</td>
        </tr>`

    }

}
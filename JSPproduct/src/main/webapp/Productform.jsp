<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Entry</title>
<style>
    form {
        padding: 25px 35px;
        width: 320px;
    }
    input[type="text"] {
        width: 100%;
        padding: 8px;
        margin-bottom: 15px;
        border: 1px solid #bbb;
        border-radius: 4px;
        font-size: 14px;
    }
    button {
        width: 105%;
        padding: 10px;
        background-color: grey;
        border-radius: 4px;
        font-size: 15px;
        cursor: pointer;
    }
</style>
</head>
<body>
    <form action="GetProduct.jsp">
        <h2>Product Entry</h2>
        <label for="pid">Product ID:</label>
        <input type="text" name="pid" id="pid">
        <label for="pname">Product Name:</label>
        <input type="text" name="pname" id="name">
        <label for="qty">Product Quantity:</label>
        <input type="text" name="qty" id="qty">
        <label for="prc">Product Price:</label>
        <input type="text" name="price" id="prc">

        <button type="submit" name="button" id="btn" value="add">Add Product</button>
    </form>
</body>
</html>

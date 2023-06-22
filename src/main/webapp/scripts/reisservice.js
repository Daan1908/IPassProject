function service_getreizen() {
    return fetch("restservices/reizen", {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    });
}
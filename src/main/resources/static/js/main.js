

Vue.component('messages-list', {
    props: ['messages'],
    template: '<div><div v-for="message in messages">{{message.text}}</div></div>'
});

var app = new Vue({
    el: '#app',
    template: '<messages-list :messages="messages"/>',
    data: {
        messages: [
            {id: '1', text: "111"},
            {id: '2', text: "222"},
            {id: '3', text: "333"}
        ]
    }
});
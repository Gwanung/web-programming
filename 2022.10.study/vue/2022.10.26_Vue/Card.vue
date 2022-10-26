<template>
   <div>
    <img :src="one_room.image" class="room-img">
    <h4 @click="$emit('openModal', one_room.id)">{{one_room.title}}</h4>
    <p>{{one_room.price}}원</p>
  </div>
</template>

<script>
export default {
    name : 'ThisCard',
    props : {
    one_room : Object,
    }
}
</script>

<style>

</style>
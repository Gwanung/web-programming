<template>
    <div class="discount">
      <h4>지금 결제하면 {{onCount}}% 할인</h4>
  </div>

</template>

<script>

export default {
  name: 'ThisDiscount',
  data(){
    return {
      onCount : 30,
    }
  },
    mounted(){
    var test = setInterval(() => {
      this.onCount --;
      if(this.onCount == 0){
        clearInterval(test);
      }
    }, 1000);
    this.$emit('count', this.onCount);
  },

}
</script>

<style>

</style>
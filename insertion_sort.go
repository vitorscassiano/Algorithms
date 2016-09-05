package main
import "fmt"

func insertion_sort(array []int) []int {
    var j, aux int
    for i := 0; i < len(array); i++ {
      aux = array[i]
      j = i - 1
      for j>=0 && aux < array[j]{
        array[j+1] = array[j]
        j = j-1
      }
      array[j+1] = aux
    }
    return array
}

func main(){
  fmt.Println(insertion_sort([]int{5,3,2,4,7,1,0,6,9,8}))
}

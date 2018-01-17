require "./binary_tree.rb"

class Heap < BinaryTree

  def initialize args
    if args[:head].nil?
      @int_arr = args[:array]
    else
      @head = args[:head]
      @int_arr = traverse
    end
    build_heap

  end

  def print_heap
    @int_arr.each do |x|
      puts x
    end
  end

  def build_heap

    l = @int_arr.length

    for index in 0..l
      heapify @int_arr, l - index

    end

  end

  def heapify arr, index
    j = index * 2 + 1
    k = j + 1
    largest = index

    if j < arr.length
      largest = arr[j] > arr[index] ? j : index
    end

    if k < arr.length
      largest = arr[k] > arr[largest] ? k : largest
    end

    if largest != index
      temp = arr[index]
      arr[index] = arr[largest]
      arr[largest] = temp
      heapify arr, largest
    end

  end

  def heap_sort
    arr = @int_arr.clone
    result = Array.new

    while arr.length != 0
      result << arr[0]
      arr[0] = arr[-1]
      arr.delete_at arr.length - 1
      heapify arr, 0
    end

    return result
  end

end
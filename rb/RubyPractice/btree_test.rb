require "./tree_node.rb"
require "./binary_tree.rb"
require "./heap.rb"

def print_tree tree
  if tree.class.to_s == "BinaryTree"
    tree.traverse.each do |x|
      puts x
    end
  elsif tree.class.to_s == "Heap"
    tree.print_heap
    puts tree.heap_sort.to_s
  end

end

module BinarytreeTest

  head = TreeNode.new(4, nil, nil)
  ten = TreeNode.new(10, nil, nil)
  two = TreeNode.new(2, nil, nil)
  head.left = ten
  head.right = two

  one = TreeNode.new(1, nil, nil)
  nine = TreeNode.new(9, nil, nil)
  ten.left = one
  ten.right = nine

  fiveFour = TreeNode.new(54, nil, nil)
  seven = TreeNode.new(7, nil, nil)
  two.left = fiveFour
  two.right = seven

  btree = BinaryTree.new(head)

  puts btree.class

  print_tree btree

  heap = Heap.new({head: btree.head})

  puts heap.class

  print_tree heap

  heap2 = Heap.new({array: [2, 4, 1, 3, 5, 7, 6, 11, 22, 45, 66, 77, 33, 22, -100, 2222, 1232131]})

  print_tree heap2

end
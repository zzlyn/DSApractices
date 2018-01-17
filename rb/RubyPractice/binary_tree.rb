class BinaryTree

  attr_accessor :head

  def initialize(head)
    @head = head
  end

  def traverse
    queue = Queue.new
    queue << @head

    arr = Array.new

    while !queue.empty?
      top = queue.pop
      arr << top.value

      if !top.left.nil?
        queue << top.left
      end
      if !top.right.nil?
        queue << top.right
      end
    end

    return arr

  end

end
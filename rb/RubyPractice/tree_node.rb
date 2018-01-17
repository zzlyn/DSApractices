class TreeNode

  attr_accessor :value, :left, :right

  def initialize(val, left, right)
    @value = val
    @left = left
    @right = right
  end

  def left=(left)
    @left = left
  end

  def right=(right)
    @right = right
  end


end
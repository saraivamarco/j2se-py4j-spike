from py4j.java_gateway import JavaGateway

gateway = JavaGateway()

stack = gateway.entry_point.getStack()

stack.push("First %s" % ('item'))
stack.push("Second item")
stack.pop()
stack.pop()
stack.pop()

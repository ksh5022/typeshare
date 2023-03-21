import Foundation

/// This is a comment.
public struct Foo: Codable {
	public let a: Int8
	public let b: Int16
	public let c: Int32
	public let e: UInt8
	public let f: UInt16
	public let g: UInt32

	public init(a: Int8, b: Int16, c: Int32, e: UInt8, f: UInt16, g: UInt32) {
		self.a = a
		self.b = b
		self.c = c
		self.e = e
		self.f = f
		self.g = g
	}
}

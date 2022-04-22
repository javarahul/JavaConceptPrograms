package javaprograms.designpattern.behavioural.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}

package net.coderbot.iris.compat.sodium.impl.block_context;

public interface ContextAwareVertexWriter {
	void iris$setContextHolder(BlockContextHolder holder);


    void iris$setQuadInfo(int normal, int tangent, float midTexCoordX, float midTexCoordY);
}

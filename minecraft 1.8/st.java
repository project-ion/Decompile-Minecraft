/*   1:    */ import java.lang.reflect.ParameterizedType;
/*   2:    */ import java.lang.reflect.Type;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ final class st
/*   6:    */   implements ParameterizedType
/*   7:    */ {
/*   8:    */   public Type[] getActualTypeArguments()
/*   9:    */   {
/*  10:161 */     return new Type[] { sr.class };
/*  11:    */   }
/*  12:    */   
/*  13:    */   public Type getRawType()
/*  14:    */   {
/*  15:168 */     return List.class;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public Type getOwnerType()
/*  19:    */   {
/*  20:173 */     return null;
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     st
 * JD-Core Version:    0.7.0.1
 */
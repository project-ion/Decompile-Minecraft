/*   1:    */ import com.google.gson.JsonDeserializationContext;
/*   2:    */ import com.google.gson.JsonDeserializer;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonSerializationContext;
/*   6:    */ import com.google.gson.JsonSerializer;
/*   7:    */ import java.lang.reflect.Type;
/*   8:    */ 
/*   9:    */ class su
/*  10:    */   implements JsonDeserializer, JsonSerializer
/*  11:    */ {
/*  12:    */   private su(ss paramss) {}
/*  13:    */   
/*  14:    */   public JsonElement a(sr paramsr, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*  15:    */   {
/*  16:142 */     JsonObject localJsonObject = new JsonObject();
/*  17:143 */     paramsr.a(localJsonObject);
/*  18:144 */     return localJsonObject;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public sr a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  22:    */   {
/*  23:149 */     if (paramJsonElement.isJsonObject())
/*  24:    */     {
/*  25:150 */       JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/*  26:151 */       sr localsr = this.a.a(localJsonObject);
/*  27:152 */       return localsr;
/*  28:    */     }
/*  29:154 */     return null;
/*  30:    */   }
/*  31:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     su
 * JD-Core Version:    0.7.0.1
 */
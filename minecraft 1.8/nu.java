/*   1:    */ import com.google.gson.JsonDeserializationContext;
/*   2:    */ import com.google.gson.JsonDeserializer;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonSerializationContext;
/*   6:    */ import com.google.gson.JsonSerializer;
/*   7:    */ import java.lang.reflect.Type;
/*   8:    */ 
/*   9:    */ public class nu
/*  10:    */   implements JsonDeserializer, JsonSerializer
/*  11:    */ {
/*  12:    */   public nt a(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  13:    */   {
/*  14:146 */     JsonObject localJsonObject = uh.l(paramJsonElement, "version");
/*  15:147 */     return new nt(uh.h(localJsonObject, "name"), uh.m(localJsonObject, "protocol"));
/*  16:    */   }
/*  17:    */   
/*  18:    */   public JsonElement a(nt paramnt, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/*  19:    */   {
/*  20:152 */     JsonObject localJsonObject = new JsonObject();
/*  21:153 */     localJsonObject.addProperty("name", paramnt.a());
/*  22:154 */     localJsonObject.addProperty("protocol", Integer.valueOf(paramnt.b()));
/*  23:155 */     return localJsonObject;
/*  24:    */   }
/*  25:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     nu
 * JD-Core Version:    0.7.0.1
 */
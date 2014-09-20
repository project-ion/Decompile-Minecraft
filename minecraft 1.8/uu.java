/*  1:   */ import com.google.gson.TypeAdapter;
/*  2:   */ import com.google.gson.stream.JsonReader;
/*  3:   */ import com.google.gson.stream.JsonToken;
/*  4:   */ import com.google.gson.stream.JsonWriter;
/*  5:   */ import java.util.Map;
/*  6:   */ 
/*  7:   */ class uu
/*  8:   */   extends TypeAdapter
/*  9:   */ {
/* 10:   */   uu(ut paramut, Map paramMap) {}
/* 11:   */   
/* 12:   */   public void write(JsonWriter paramJsonWriter, Object paramObject)
/* 13:   */   {
/* 14:36 */     if (paramObject == null) {
/* 15:37 */       paramJsonWriter.nullValue();
/* 16:   */     } else {
/* 17:39 */       paramJsonWriter.value(ut.a(this.b, paramObject));
/* 18:   */     }
/* 19:   */   }
/* 20:   */   
/* 21:   */   public Object read(JsonReader paramJsonReader)
/* 22:   */   {
/* 23:45 */     if (paramJsonReader.peek() == JsonToken.NULL)
/* 24:   */     {
/* 25:46 */       paramJsonReader.nextNull();
/* 26:47 */       return null;
/* 27:   */     }
/* 28:49 */     return this.a.get(paramJsonReader.nextString());
/* 29:   */   }
/* 30:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     uu
 * JD-Core Version:    0.7.0.1
 */
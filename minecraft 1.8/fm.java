/*  1:   */ import java.io.DataInput;
/*  2:   */ import java.io.DataOutput;
/*  3:   */ 
/*  4:   */ public class fm
/*  5:   */   extends ge
/*  6:   */ {
/*  7:   */   private byte b;
/*  8:   */   
/*  9:   */   fm() {}
/* 10:   */   
/* 11:   */   public fm(byte paramByte)
/* 12:   */   {
/* 13:16 */     this.b = paramByte;
/* 14:   */   }
/* 15:   */   
/* 16:   */   void a(DataOutput paramDataOutput)
/* 17:   */   {
/* 18:21 */     paramDataOutput.writeByte(this.b);
/* 19:   */   }
/* 20:   */   
/* 21:   */   void a(DataInput paramDataInput, int paramInt, fx paramfx)
/* 22:   */   {
/* 23:26 */     paramfx.a(8L);
/* 24:27 */     this.b = paramDataInput.readByte();
/* 25:   */   }
/* 26:   */   
/* 27:   */   public byte a()
/* 28:   */   {
/* 29:32 */     return 1;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String toString()
/* 33:   */   {
/* 34:37 */     return "" + this.b + "b";
/* 35:   */   }
/* 36:   */   
/* 37:   */   public gd b()
/* 38:   */   {
/* 39:42 */     return new fm(this.b);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean equals(Object paramObject)
/* 43:   */   {
/* 44:47 */     if (super.equals(paramObject))
/* 45:   */     {
/* 46:48 */       fm localfm = (fm)paramObject;
/* 47:49 */       return this.b == localfm.b;
/* 48:   */     }
/* 49:51 */     return false;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int hashCode()
/* 53:   */   {
/* 54:56 */     return super.hashCode() ^ this.b;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public long c()
/* 58:   */   {
/* 59:61 */     return this.b;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public int d()
/* 63:   */   {
/* 64:66 */     return this.b;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public short e()
/* 68:   */   {
/* 69:71 */     return (short)this.b;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public byte f()
/* 73:   */   {
/* 74:76 */     return this.b;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public double g()
/* 78:   */   {
/* 79:81 */     return this.b;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public float h()
/* 83:   */   {
/* 84:86 */     return this.b;
/* 85:   */   }
/* 86:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     fm
 * JD-Core Version:    0.7.0.1
 */